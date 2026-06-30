package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.ArrayMap f193127a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f193128b = false;

    public z1() {
        this.f193127a = null;
        this.f193127a = new android.util.ArrayMap();
    }

    public java.lang.String a(java.lang.String str) {
        java.lang.Object obj = this.f193127a.get(str);
        try {
            return (java.lang.String) obj;
        } catch (java.lang.ClassCastException e17) {
            b(str, obj, "String", "<null>", e17);
            return null;
        }
    }

    public void b(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.Object obj2, java.lang.ClassCastException classCastException) {
        com.tencent.stubs.logger.Log.w("MicroMsg.ImmutableBundle", "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        com.tencent.stubs.logger.Log.w("MicroMsg.ImmutableBundle", "Attempt to cast generated internal exception:", classCastException);
    }
}
