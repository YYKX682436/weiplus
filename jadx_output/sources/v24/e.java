package v24;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.setting.ui.setting.l f432910a;

    /* renamed from: b, reason: collision with root package name */
    public final long f432911b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f432912c;

    /* renamed from: d, reason: collision with root package name */
    public jz5.l f432913d;

    /* renamed from: e, reason: collision with root package name */
    public int f432914e;

    public e(com.tencent.mm.plugin.setting.ui.setting.l scene, long j17) {
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f432910a = scene;
        this.f432911b = j17;
        this.f432912c = jz5.h.b(v24.d.f432906d);
    }

    public static /* synthetic */ void c(v24.e eVar, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            str = "";
        }
        java.lang.String str3 = str;
        if ((i27 & 8) != 0) {
            str2 = null;
        }
        java.lang.String str4 = str2;
        if ((i27 & 16) != 0) {
            i19 = 0;
        }
        eVar.b(i17, i18, str3, str4, i19);
    }

    public final java.lang.String a(com.tencent.mm.plugin.setting.ui.setting.l lVar, java.lang.Long l17, java.lang.String str, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lVar != null ? lVar.f161262d : 0);
        sb6.append('_');
        sb6.append(i17);
        sb6.append('_');
        sb6.append(l17 != null ? l17.longValue() : 0L);
        sb6.append('_');
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        return sb6.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if ((r6 - r16.longValue()) < 3000) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r21, int r22, java.lang.String r23, java.lang.String r24, int r25) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v24.e.b(int, int, java.lang.String, java.lang.String, int):void");
    }
}
