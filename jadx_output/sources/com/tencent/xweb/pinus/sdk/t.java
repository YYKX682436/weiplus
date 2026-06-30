package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class t implements com.tencent.xweb.pinus.sdk.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f220468a;

    /* renamed from: b, reason: collision with root package name */
    public by5.i0 f220469b;

    /* renamed from: c, reason: collision with root package name */
    public by5.i0 f220470c;

    public t(java.lang.Object obj) {
        this.f220468a = obj;
    }

    public java.lang.CharSequence a() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f220470c;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220468a, "getDescription", new java.lang.Class[0]);
                    this.f220470c = i0Var;
                }
            }
            return (java.lang.CharSequence) i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }

    public int b() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f220469b;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220468a, "getErrorCode", new java.lang.Class[0]);
                    this.f220469b = i0Var;
                }
            }
            return ((java.lang.Integer) i0Var.b(new java.lang.Object[0])).intValue();
        } catch (java.lang.UnsupportedOperationException unused) {
            return 0;
        }
    }
}
