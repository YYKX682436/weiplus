package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class g1 implements pm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f212946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.h1 f212947b;

    public g1(com.tencent.mm.vfs.h1 h1Var, java.util.Map map) {
        this.f212947b = h1Var;
        this.f212946a = map;
    }

    @Override // pm5.a
    public java.lang.Iterable a(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        java.util.HashMap hashMap = new java.util.HashMap(this.f212946a);
        com.tencent.mm.vfs.h1 h1Var = this.f212947b;
        if (h1Var.f212969g == null) {
            hashMap.put(h1Var.f212968f, str);
        } else {
            int i17 = 0;
            int i18 = 0;
            while (true) {
                int indexOf = str.indexOf(h1Var.f212970h, i17);
                if (indexOf < 0 || h1Var.f212969g.size() - i18 <= 1) {
                    break;
                }
                hashMap.put((java.lang.String) h1Var.f212969g.get(i18), str.substring(i17, indexOf));
                i17 = indexOf + 1;
                i18++;
            }
            hashMap.put((java.lang.String) h1Var.f212969g.get(i18), str.substring(i17));
        }
        java.lang.Object obj2 = h1Var.f212966d;
        if (!(obj2 instanceof com.tencent.mm.vfs.FileSystem)) {
            return ((com.tencent.mm.vfs.h1) obj2).b(hashMap);
        }
        com.tencent.mm.vfs.q2 q2Var = (com.tencent.mm.vfs.q2) ((com.tencent.mm.vfs.FileSystem) obj2).b(hashMap);
        if (q2Var == com.tencent.mm.vfs.NullFileSystem.f()) {
            return null;
        }
        return java.util.Collections.singleton(q2Var);
    }
}
