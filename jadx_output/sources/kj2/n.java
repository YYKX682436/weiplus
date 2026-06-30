package kj2;

/* loaded from: classes10.dex */
public final class n extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj2.o f308420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f308421b;

    public n(kj2.o oVar, java.util.ArrayList arrayList) {
        this.f308420a = oVar;
        this.f308421b = arrayList;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        vi2.g gVar;
        vi2.g gVar2;
        vi2.h hVar = (vi2.h) kz5.n0.a0(this.f308420a.f308429h, i17);
        java.lang.Integer num = null;
        java.lang.Integer valueOf = (hVar == null || (gVar2 = hVar.f437550d) == null) ? null : java.lang.Integer.valueOf(gVar2.ordinal());
        vi2.h hVar2 = (vi2.h) kz5.n0.a0(this.f308421b, i18);
        if (hVar2 != null && (gVar = hVar2.f437550d) != null) {
            num = java.lang.Integer.valueOf(gVar.ordinal());
        }
        return kotlin.jvm.internal.o.b(valueOf, num);
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        r45.xn1 xn1Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        vi2.h hVar = (vi2.h) kz5.n0.a0(this.f308420a.f308429h, i17);
        java.lang.String str = null;
        java.lang.String username = (hVar == null || (xn1Var2 = hVar.f437551e) == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact2.getUsername();
        vi2.h hVar2 = (vi2.h) kz5.n0.a0(this.f308421b, i18);
        if (hVar2 != null && (xn1Var = hVar2.f437551e) != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
            str = finderContact.getUsername();
        }
        return kotlin.jvm.internal.o.b(username, str);
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f308421b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f308420a.f308429h.size();
    }
}
