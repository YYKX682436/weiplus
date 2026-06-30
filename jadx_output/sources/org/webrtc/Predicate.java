package org.webrtc;

/* loaded from: classes16.dex */
public interface Predicate<T> {
    default org.webrtc.Predicate<T> and(final org.webrtc.Predicate<? super T> predicate) {
        return new org.webrtc.Predicate<T>() { // from class: org.webrtc.Predicate.2
            @Override // org.webrtc.Predicate
            public boolean test(T t17) {
                return org.webrtc.Predicate.this.test(t17) && predicate.test(t17);
            }
        };
    }

    default org.webrtc.Predicate<T> negate() {
        return new org.webrtc.Predicate<T>() { // from class: org.webrtc.Predicate.3
            @Override // org.webrtc.Predicate
            public boolean test(T t17) {
                return !org.webrtc.Predicate.this.test(t17);
            }
        };
    }

    default org.webrtc.Predicate<T> or(final org.webrtc.Predicate<? super T> predicate) {
        return new org.webrtc.Predicate<T>() { // from class: org.webrtc.Predicate.1
            @Override // org.webrtc.Predicate
            public boolean test(T t17) {
                return org.webrtc.Predicate.this.test(t17) || predicate.test(t17);
            }
        };
    }

    boolean test(T t17);
}
