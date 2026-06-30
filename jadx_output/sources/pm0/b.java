package pm0;

/* loaded from: classes12.dex */
public final class b implements pm0.z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Long[] f356759a;

    /* renamed from: b, reason: collision with root package name */
    public final int f356760b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f356761c;

    /* renamed from: d, reason: collision with root package name */
    public final pm0.a f356762d;

    public b(java.lang.Long[] idKeyArray, int i17, java.lang.String name, pm0.a generator) {
        kotlin.jvm.internal.o.g(idKeyArray, "idKeyArray");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(generator, "generator");
        this.f356759a = idKeyArray;
        this.f356760b = i17;
        this.f356761c = name;
        this.f356762d = generator;
    }

    @Override // pm0.z
    public void c(java.lang.String key, boolean z17, pm0.w level, java.lang.String str, boolean z18, boolean z19, yz5.a message) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(level, "level");
        kotlin.jvm.internal.o.g(message, "message");
        if (z17) {
            return;
        }
        e("assertTrue", key, (java.lang.String) message.invoke(), z18, z19, level, str);
    }

    @Override // pm0.z
    public void d(java.lang.String key, boolean z17, pm0.w level, java.lang.String str, boolean z18, boolean z19, yz5.a message) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(level, "level");
        kotlin.jvm.internal.o.g(message, "message");
        if (z17) {
            e("assertFalse", key, (java.lang.String) message.invoke(), z18, z19, level, str);
        }
    }

    public final void e(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, pm0.w wVar, java.lang.String str4) {
        int a17 = this.f356762d.a(str2);
        java.lang.String str5 = str + ": key=[" + str2 + ':' + a17 + "] owner=" + str4 + " message=" + str3;
        int i17 = wVar.f356808d;
        pm0.w wVar2 = pm0.w.f356804e;
        if (i17 <= 1) {
            com.tencent.mars.xlog.Log.w(this.f356761c, str5);
        } else {
            com.tencent.mars.xlog.Log.e(this.f356761c, str5);
        }
        if (z17) {
            int i18 = a17 / 255;
            if (a17 > 0) {
                java.lang.Long[] lArr = this.f356759a;
                if (lArr.length > i18) {
                    vo.c.INSTANCE.b(lArr[i18].longValue(), a17, 1L);
                }
            }
            vo.c.f438464e.a(this.f356760b, java.lang.String.valueOf(this.f356762d.getVersion()), java.lang.String.valueOf(a17), str3, str2, java.lang.Integer.valueOf(wVar.f356808d), str4);
        }
        if (z18) {
            throw new iz5.b(str5);
        }
    }
}
