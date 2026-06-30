package wq2;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f448523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.uz2 f448524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wq2.h f448525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.yz2 f448526g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f448527h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r45.fa2 fa2Var, r45.uz2 uz2Var, wq2.h hVar, r45.yz2 yz2Var, boolean z17) {
        super(1);
        this.f448523d = fa2Var;
        this.f448524e = uz2Var;
        this.f448525f = hVar;
        this.f448526g = yz2Var;
        this.f448527h = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zq2.b bVar;
        zq2.c it = (zq2.c) obj;
        kotlin.jvm.internal.o.g(it, "it");
        r45.fa2 fa2Var = this.f448523d;
        int i17 = fa2Var.f374126e;
        r45.uz2 containerInfo = this.f448524e;
        if (i17 == 11) {
            kotlin.jvm.internal.o.f(containerInfo, "$containerInfo");
            bVar = new zq2.d(containerInfo, fa2Var);
        } else if (i17 == 10) {
            kotlin.jvm.internal.o.f(containerInfo, "$containerInfo");
            bVar = new zq2.a(containerInfo, fa2Var);
        } else {
            kotlin.jvm.internal.o.f(containerInfo, "$containerInfo");
            bVar = new zq2.b(containerInfo, fa2Var);
        }
        java.util.LinkedList<r45.ea2> linkedList = fa2Var.f374129h;
        java.util.ArrayList arrayList = bVar.f475027e;
        wq2.h hVar = this.f448525f;
        if (linkedList != null) {
            boolean z17 = this.f448527h;
            for (r45.ea2 ea2Var : linkedList) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
                if (finderObject != null) {
                    cu2.t tVar = cu2.u.f222441a;
                    java.util.List c17 = kz5.b0.c(finderObject);
                    int d17 = hc2.d0.d(0);
                    android.app.Activity context = hVar.f448529a;
                    kotlin.jvm.internal.o.g(context, "context");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) kz5.n0.Z(tVar.j(c17, d17, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6()));
                    if (finderItem != null) {
                        int integer = ea2Var.getInteger(1);
                        if (integer == 4) {
                            arrayList.add(new vp2.d0(finderItem, ea2Var, fa2Var, ea2Var.getString(8), z17));
                        } else if (integer == 13) {
                            arrayList.add(new vp2.i0(finderItem, ea2Var, fa2Var, ea2Var.getString(8), z17));
                        }
                    }
                }
            }
        }
        java.lang.String themeId = hVar.f448535g;
        java.lang.String str = containerInfo.f387748e;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        r45.yz2 yz2Var = this.f448526g;
        kotlin.jvm.internal.o.g(themeId, "themeId");
        it.f475031g.Q6(themeId, str2, 0, 0, arrayList, yz2Var != null ? yz2Var.f391522i : null, yz2Var);
        return jz5.f0.f302826a;
    }
}
