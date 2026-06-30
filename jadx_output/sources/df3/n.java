package df3;

@j95.b
/* loaded from: classes7.dex */
public final class n extends i95.w implements com.tencent.mm.plugin.magicbrush.t4 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f232027d;

    public final void Ai() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        bf3.x0 x0Var = bf3.x0.f19674a;
        kotlin.jvm.internal.o.d(context);
        android.graphics.Point a17 = x0Var.a(context);
        float a18 = bf3.p0.f19645a.a();
        int b17 = a06.d.b(a17.x / a18);
        int b18 = a06.d.b(a17.y / a18);
        java.lang.String RELEASE = android.os.Build.VERSION.RELEASE;
        kotlin.jvm.internal.o.f(RELEASE, "RELEASE");
        java.lang.Object value = ((jz5.n) bf3.p0.f19650f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.lang.String str = (java.lang.String) value;
        java.lang.Object value2 = ((jz5.n) bf3.p0.f19649e).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        java.lang.String str2 = (java.lang.String) value2;
        long j17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        java.lang.String CLIENT_VERSION = com.tencent.mm.sdk.platformtools.z.f193111g;
        kotlin.jvm.internal.o.f(CLIENT_VERSION, "CLIENT_VERSION");
        int i17 = com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation;
        java.lang.String str3 = i17 != 1 ? i17 != 2 ? "" : "landscape" : "portrait";
        float floatValue = ((java.lang.Number) ((jz5.n) bf3.p0.f19647c).getValue()).floatValue();
        java.lang.Object value3 = ((jz5.n) bf3.p0.f19651g).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        boolean C = com.tencent.mm.ui.bk.C();
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        com.tencent.wemagic.common.zidl_gen.c cVar = com.tencent.wemagic.common.zidl_gen.c.f220085b;
        com.tencent.wemagic.common.zidl_gen.a aVar = new com.tencent.wemagic.common.zidl_gen.a();
        aVar.f220069d = RELEASE;
        boolean[] zArr = aVar.f220084v;
        zArr[1] = true;
        aVar.f220070e = str;
        zArr[2] = true;
        aVar.f220071f = str2;
        zArr[3] = true;
        aVar.f220072g = com.eclipsesource.mmv8.Platform.ANDROID;
        zArr[4] = true;
        aVar.f220073h = "";
        zArr[5] = true;
        aVar.f220074i = j17;
        zArr[6] = true;
        aVar.f220075m = CLIENT_VERSION;
        zArr[7] = true;
        aVar.f220076n = b17;
        zArr[8] = true;
        aVar.f220077o = b18;
        zArr[9] = true;
        aVar.f220079q = str3;
        zArr[11] = true;
        aVar.f220078p = a18;
        zArr[10] = true;
        aVar.f220080r = floatValue;
        zArr[12] = true;
        aVar.f220081s = (java.lang.String) value3;
        zArr[13] = true;
        aVar.f220082t = C;
        zArr[14] = true;
        aVar.f220083u = isTeenMode;
        zArr[15] = true;
        cVar.e(aVar);
        com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.addLifecycleCallback(new df3.i());
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context2).registerComponentCallbacks(new df3.j());
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(df3.k.f232024d);
    }

    public final java.util.LinkedList wi() {
        java.util.Map k17 = kz5.c1.k(new jz5.l("MagicSclPublicService", ge3.q.f270972a), new jz5.l("MagicSclNativeDemo", ge3.o.f270970a));
        java.util.ArrayList arrayList = new java.util.ArrayList(k17.size());
        for (java.util.Map.Entry entry : k17.entrySet()) {
            com.tencent.wechat.aff.magicbrush.a aVar = new com.tencent.wechat.aff.magicbrush.a();
            java.lang.String str = (java.lang.String) entry.getKey();
            ge3.a aVar2 = (ge3.a) entry.getValue();
            lc3.a aVar3 = new lc3.a("mbpkgs/" + str + ".wspkg", 0L, aVar2.getMd5(), 0L);
            aVar.f217362d = str;
            boolean[] zArr = aVar.f217369n;
            zArr[1] = true;
            aVar.f217363e = bf3.r0.d(aVar3, str);
            zArr[2] = true;
            bf3.r0.b(aVar3, str);
            aVar.f217364f = aVar2.getUrl();
            zArr[3] = true;
            aVar.f217365g = aVar2.getMd5();
            zArr[4] = true;
            aVar.f217366h = aVar2.a();
            zArr[5] = true;
            aVar.f217368m = aVar2.d();
            zArr[7] = true;
            aVar.f217367i = aVar2.b();
            zArr[6] = true;
            boolean z17 = zArr[1];
            arrayList.add(aVar);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        kz5.n0.O0(arrayList, linkedList);
        return linkedList;
    }
}
