/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jetbrain.javastyles;

import java.io.Serializable;
import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class javastyles {
    
    @Inherited
    @Documented
    public @interface DefaultProperty {
        public final class String extends Object  {

            public int compareTo(String t) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            public int length() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            public char charAt(int i) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            public boolean isEmpty() {
                return false;
            }

            public CharSequence subSequence(int i, int i1) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            public IntStream chars() {
                return null;
            }

            public IntStream codePoints() {
                return null;
            }

            public Optional<? extends ConstantDesc> describeConstable() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        }
    }
    
    @Override
    public String toString() {
        
        return getClass().getName() + '@' + Integer.toHexString(hashCode());
        
    }
    
    public final class StringBuffer extends Object implements Serializable, 
            Comparable<StringBuffer>, CharSequence {

        @Override
        public int compareTo(StringBuffer t) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public int length() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public char charAt(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean isEmpty() {
            return CharSequence.super.isEmpty(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        @Override
        public CharSequence subSequence(int i, int i1) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public IntStream chars() {
            return CharSequence.super.chars(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        @Override
        public IntStream codePoints() {
            return CharSequence.super.codePoints(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
    }
    
       
}
