package mm2;

/* loaded from: classes3.dex */
public final class k2 extends mm2.e {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f329192h;

    /* renamed from: f, reason: collision with root package name */
    public kn0.e f329193f;

    /* renamed from: g, reason: collision with root package name */
    public int f329194g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String N6(boolean z17, java.lang.String key) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(key, "key");
        kn0.e eVar = this.f329193f;
        if (eVar == null) {
            return "last qosInfo is null";
        }
        java.lang.Object[] objArr = eVar.f309505c == 1;
        com.tencent.mm.plugin.finder.live.util.m2 m2Var = com.tencent.mm.plugin.finder.live.util.m2.f115628a;
        java.lang.String str2 = null;
        if (objArr == true) {
            if (com.tencent.mm.plugin.finder.live.util.m2.f115630c == null) {
                com.tencent.mm.plugin.finder.live.util.m2.f115630c = new com.tencent.mm.plugin.finder.live.util.j();
            }
            int i17 = (int) eVar.D;
            com.tencent.mm.plugin.finder.live.util.j jVar = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
            m2Var.a(i17, jVar != null ? jVar.f115552b : null);
            int i18 = eVar.f309508f;
            com.tencent.mm.plugin.finder.live.util.j jVar2 = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
            m2Var.a(i18, jVar2 != null ? jVar2.f115556f : null);
            int i19 = eVar.f309509g;
            com.tencent.mm.plugin.finder.live.util.j jVar3 = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
            m2Var.a(i19, jVar3 != null ? jVar3.f115557g : null);
            int i27 = eVar.f309511i;
            com.tencent.mm.plugin.finder.live.util.j jVar4 = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
            m2Var.a(i27, jVar4 != null ? jVar4.f115558h : null);
            int i28 = eVar.f309510h;
            com.tencent.mm.plugin.finder.live.util.j jVar5 = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
            m2Var.a(i28, jVar5 != null ? jVar5.f115555e : null);
            int i29 = eVar.f309512j;
            com.tencent.mm.plugin.finder.live.util.j jVar6 = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
            m2Var.a(i29, jVar6 != null ? jVar6.f115553c : null);
            int i37 = eVar.f309513k;
            com.tencent.mm.plugin.finder.live.util.j jVar7 = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
            m2Var.a(i37, jVar7 != null ? jVar7.f115554d : null);
            int i38 = eVar.f309514l;
            com.tencent.mm.plugin.finder.live.util.j jVar8 = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
            m2Var.a(i38, jVar8 != null ? jVar8.f115559i : null);
            int i39 = eVar.f309521s;
            com.tencent.mm.plugin.finder.live.util.j jVar9 = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
            m2Var.a(i39, jVar9 != null ? jVar9.f115560j : null);
            int i47 = eVar.f309519q;
            com.tencent.mm.plugin.finder.live.util.j jVar10 = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
            m2Var.a(i47, jVar10 != null ? jVar10.f115561k : null);
            int i48 = eVar.f309518p;
            com.tencent.mm.plugin.finder.live.util.j jVar11 = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
            m2Var.a(i48, jVar11 != null ? jVar11.f115562l : null);
            int i49 = eVar.f309515m;
            com.tencent.mm.plugin.finder.live.util.j jVar12 = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
            m2Var.a(i49, jVar12 != null ? jVar12.f115563m : null);
            int i57 = eVar.f309517o;
            com.tencent.mm.plugin.finder.live.util.j jVar13 = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
            m2Var.a(i57, jVar13 != null ? jVar13.f115564n : null);
        } else {
            if (com.tencent.mm.plugin.finder.live.util.m2.f115629b == null) {
                com.tencent.mm.plugin.finder.live.util.m2.f115629b = new com.tencent.mm.plugin.finder.live.util.c3();
            }
            int i58 = (int) eVar.D;
            com.tencent.mm.plugin.finder.live.util.c3 c3Var = com.tencent.mm.plugin.finder.live.util.m2.f115629b;
            m2Var.a(i58, c3Var != null ? c3Var.f115459a : null);
            int i59 = eVar.f309528z;
            com.tencent.mm.plugin.finder.live.util.c3 c3Var2 = com.tencent.mm.plugin.finder.live.util.m2.f115629b;
            m2Var.a(i59, c3Var2 != null ? c3Var2.f115462d : null);
            int i66 = eVar.F;
            com.tencent.mm.plugin.finder.live.util.c3 c3Var3 = com.tencent.mm.plugin.finder.live.util.m2.f115629b;
            m2Var.a(i66, c3Var3 != null ? c3Var3.f115463e : null);
            int i67 = eVar.G;
            com.tencent.mm.plugin.finder.live.util.c3 c3Var4 = com.tencent.mm.plugin.finder.live.util.m2.f115629b;
            m2Var.a(i67, c3Var4 != null ? c3Var4.f115464f : null);
            long j17 = 1000;
            int i68 = (int) (eVar.H / j17);
            com.tencent.mm.plugin.finder.live.util.c3 c3Var5 = com.tencent.mm.plugin.finder.live.util.m2.f115629b;
            m2Var.a(i68, c3Var5 != null ? c3Var5.f115465g : null);
            int i69 = (int) (eVar.I / j17);
            com.tencent.mm.plugin.finder.live.util.c3 c3Var6 = com.tencent.mm.plugin.finder.live.util.m2.f115629b;
            m2Var.a(i69, c3Var6 != null ? c3Var6.f115466h : null);
            int i76 = eVar.f309508f;
            com.tencent.mm.plugin.finder.live.util.c3 c3Var7 = com.tencent.mm.plugin.finder.live.util.m2.f115629b;
            m2Var.a(i76, c3Var7 != null ? c3Var7.f115468j : null);
            int i77 = eVar.f309509g;
            com.tencent.mm.plugin.finder.live.util.c3 c3Var8 = com.tencent.mm.plugin.finder.live.util.m2.f115629b;
            m2Var.a(i77, c3Var8 != null ? c3Var8.f115469k : null);
            int i78 = eVar.f309510h;
            com.tencent.mm.plugin.finder.live.util.c3 c3Var9 = com.tencent.mm.plugin.finder.live.util.m2.f115629b;
            m2Var.a(i78, c3Var9 != null ? c3Var9.f115467i : null);
            int i79 = eVar.f309512j;
            com.tencent.mm.plugin.finder.live.util.c3 c3Var10 = com.tencent.mm.plugin.finder.live.util.m2.f115629b;
            m2Var.a(i79, c3Var10 != null ? c3Var10.f115460b : null);
            int i86 = eVar.f309513k;
            com.tencent.mm.plugin.finder.live.util.c3 c3Var11 = com.tencent.mm.plugin.finder.live.util.m2.f115629b;
            m2Var.a(i86, c3Var11 != null ? c3Var11.f115461c : null);
        }
        com.tencent.mm.plugin.finder.live.util.j jVar14 = com.tencent.mm.plugin.finder.live.util.m2.f115630c;
        if (jVar14 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.live.util.b3 b3Var = jVar14.f115556f;
            sb7.append(b3Var.f115449b.f115582a);
            sb7.append(':');
            sb7.append(b3Var.f115449b.f115583b);
            sb7.append('\n');
            sb6.append(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.live.util.b3 b3Var2 = jVar14.f115557g;
            sb8.append(b3Var2.f115449b.f115582a);
            sb8.append(':');
            sb8.append(b3Var2.f115449b.f115583b);
            sb8.append('\n');
            sb6.append(sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.live.util.b3 b3Var3 = jVar14.f115558h;
            sb9.append(b3Var3.f115449b.f115582a);
            sb9.append(':');
            sb9.append(b3Var3.f115449b.f115583b);
            sb9.append('\n');
            sb6.append(sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.live.util.b3 b3Var4 = jVar14.f115552b;
            sb10.append(b3Var4.f115449b.f115582a);
            sb10.append(':');
            sb10.append(b3Var4.f115449b.f115583b);
            sb10.append('(');
            com.tencent.mm.plugin.finder.live.util.a aVar = b3Var4.f115450c;
            sb10.append(aVar != null ? java.lang.Long.valueOf(aVar.f115436d) : null);
            sb10.append(")\n");
            sb6.append(sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.live.util.b3 b3Var5 = jVar14.f115555e;
            sb11.append(b3Var5.f115449b.f115582a);
            sb11.append(':');
            sb11.append(b3Var5.f115449b.f115583b);
            sb11.append('(');
            com.tencent.mm.plugin.finder.live.util.a aVar2 = b3Var5.f115450c;
            sb11.append(aVar2 != null ? java.lang.Long.valueOf(aVar2.f115436d) : null);
            sb11.append(")\n");
            sb6.append(sb11.toString());
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.live.util.b3 b3Var6 = jVar14.f115553c;
            sb12.append(b3Var6.f115449b.f115582a);
            sb12.append(':');
            sb12.append(b3Var6.f115449b.f115583b);
            sb12.append('(');
            com.tencent.mm.plugin.finder.live.util.a aVar3 = b3Var6.f115450c;
            sb12.append(aVar3 != null ? java.lang.Long.valueOf(aVar3.f115436d) : null);
            sb12.append(")\n");
            sb6.append(sb12.toString());
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.live.util.b3 b3Var7 = jVar14.f115554d;
            sb13.append(b3Var7.f115449b.f115582a);
            sb13.append(':');
            sb13.append(b3Var7.f115449b.f115583b);
            sb13.append('(');
            com.tencent.mm.plugin.finder.live.util.a aVar4 = b3Var7.f115450c;
            sb13.append(aVar4 != null ? java.lang.Long.valueOf(aVar4.f115436d) : null);
            sb13.append(")\n");
            sb6.append(sb13.toString());
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.live.util.b3 b3Var8 = jVar14.f115559i;
            sb14.append(b3Var8.f115449b.f115582a);
            sb14.append(':');
            sb14.append(b3Var8.f115449b.f115583b);
            sb14.append('(');
            com.tencent.mm.plugin.finder.live.util.a aVar5 = b3Var8.f115450c;
            sb14.append(aVar5 != null ? java.lang.Long.valueOf(aVar5.f115436d) : null);
            sb14.append(")\n");
            sb6.append(sb14.toString());
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.live.util.b3 b3Var9 = jVar14.f115560j;
            sb15.append(b3Var9.f115449b.f115582a);
            sb15.append(':');
            sb15.append(b3Var9.f115449b.f115583b);
            sb15.append('(');
            com.tencent.mm.plugin.finder.live.util.a aVar6 = b3Var9.f115450c;
            sb15.append(aVar6 != null ? java.lang.Long.valueOf(aVar6.f115436d) : null);
            sb15.append(")\n");
            sb6.append(sb15.toString());
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.live.util.b3 b3Var10 = jVar14.f115561k;
            sb16.append(b3Var10.f115449b.f115582a);
            sb16.append(':');
            sb16.append(b3Var10.f115449b.f115583b);
            sb16.append('(');
            com.tencent.mm.plugin.finder.live.util.a aVar7 = b3Var10.f115450c;
            sb16.append(aVar7 != null ? java.lang.Long.valueOf(aVar7.f115436d) : null);
            sb16.append(")\n");
            sb6.append(sb16.toString());
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.live.util.b3 b3Var11 = jVar14.f115562l;
            sb17.append(b3Var11.f115449b.f115582a);
            sb17.append(':');
            sb17.append(b3Var11.f115449b.f115583b);
            sb17.append('(');
            com.tencent.mm.plugin.finder.live.util.a aVar8 = b3Var11.f115450c;
            sb17.append(aVar8 != null ? java.lang.Long.valueOf(aVar8.f115436d) : null);
            sb17.append(")\n");
            sb6.append(sb17.toString());
            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.live.util.b3 b3Var12 = jVar14.f115563m;
            sb18.append(b3Var12.f115449b.f115582a);
            sb18.append(':');
            sb18.append(b3Var12.f115449b.f115583b);
            sb18.append('(');
            com.tencent.mm.plugin.finder.live.util.a aVar9 = b3Var12.f115450c;
            sb18.append(aVar9 != null ? java.lang.Long.valueOf(aVar9.f115436d) : null);
            sb18.append(")\n");
            sb6.append(sb18.toString());
            java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.live.util.b3 b3Var13 = jVar14.f115564n;
            sb19.append(b3Var13.f115449b.f115582a);
            sb19.append(':');
            sb19.append(b3Var13.f115449b.f115583b);
            sb19.append('(');
            com.tencent.mm.plugin.finder.live.util.a aVar10 = b3Var13.f115450c;
            sb19.append(aVar10 != null ? java.lang.Long.valueOf(aVar10.f115436d) : null);
            sb19.append(")\n");
            sb6.append(sb19.toString());
            str2 = sb6.toString();
            kotlin.jvm.internal.o.f(str2, "toString(...)");
        }
        if (z17) {
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            sb20.append(str2);
            sb20.append('\n');
            jz5.g gVar = ko0.p0.f309896a;
            java.lang.Boolean bool = (java.lang.Boolean) ((com.tencent.mm.sdk.platformtools.r2) ((jz5.n) ko0.p0.f309896a).getValue()).get(key);
            if ((bool != null) != false) {
                kotlin.jvm.internal.o.d(bool);
                if (bool.booleanValue()) {
                    str = "H265";
                    sb20.append(str);
                    sb20.append('\n');
                    str2 = sb20.toString();
                }
            }
            str = "H264";
            sb20.append(str);
            sb20.append('\n');
            str2 = sb20.toString();
        } else {
            if ((key.length() == 0) == false) {
                ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
                d11.s.Di(5);
                java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
                sb21.append(str2);
                jz5.g gVar2 = ko0.p0.f309896a;
                ko0.t tVar = ko0.t.f309903a;
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                sb21.append("\n");
                str2 = sb21.toString();
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        java.lang.StringBuilder sb22 = new java.lang.StringBuilder(str2);
        sb22.append("liveId:" + ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0) + '\n');
        sb22.append("objectId:" + pm0.v.u(((mm2.e1) business(mm2.e1.class)).f328983m) + '\n');
        java.lang.String sb23 = sb22.toString();
        kn0.e eVar2 = this.f329193f;
        if (eVar2 != null && eVar2.f309505c == 1) {
            return "Mode CDN\n" + ((mm2.c1) business(mm2.c1.class)).D7() + sb23;
        }
        return "Mode Trtc\n" + ((mm2.c1) business(mm2.c1.class)).D7() + sb23;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.f329193f = null;
        this.f329194g = 0;
    }
}
