package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public class ia {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f195036a;

    public ia(java.lang.String str) {
        int indexOf = str.indexOf("@");
        if (indexOf < 0) {
            this.f195036a = "";
        } else {
            str.substring(0, indexOf);
            this.f195036a = str.substring(indexOf);
        }
    }
}
