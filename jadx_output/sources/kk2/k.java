package kk2;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk2.p f308497d;

    public k(kk2.p pVar) {
        this.f308497d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        c50.m0 y17;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2;
        c50.m0 y18;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3;
        c50.m0 y19;
        kk2.p pVar = this.f308497d;
        r45.fa2 fa2Var = pVar.f308514s;
        if (fa2Var != null) {
            java.util.LinkedList card_list = fa2Var.f374129h;
            kotlin.jvm.internal.o.f(card_list, "card_list");
            r45.ea2 ea2Var = (r45.ea2) kz5.n0.a0(card_list, 0);
            if (ea2Var != null && (finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2)) != null && (y19 = pVar.y()) != null) {
                fg2.s1 s1Var = pVar.f308510o;
                if (s1Var == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                com.tencent.mm.plugin.finder.live.view.GuideSquareLivingCardView liveOne = s1Var.f262301g;
                kotlin.jvm.internal.o.f(liveOne, "liveOne");
                c50.m0.a(y19, finderObject3, liveOne, null, null, null, false, 60, null);
            }
            kotlin.jvm.internal.o.f(card_list, "card_list");
            r45.ea2 ea2Var2 = (r45.ea2) kz5.n0.a0(card_list, 1);
            if (ea2Var2 != null && (finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var2.getCustom(2)) != null && (y18 = pVar.y()) != null) {
                fg2.s1 s1Var2 = pVar.f308510o;
                if (s1Var2 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                com.tencent.mm.plugin.finder.live.view.GuideSquareLivingCardView liveTwo = s1Var2.f262303i;
                kotlin.jvm.internal.o.f(liveTwo, "liveTwo");
                c50.m0.a(y18, finderObject2, liveTwo, null, null, null, false, 60, null);
            }
            kotlin.jvm.internal.o.f(card_list, "card_list");
            r45.ea2 ea2Var3 = (r45.ea2) kz5.n0.a0(card_list, 2);
            if (ea2Var3 == null || (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var3.getCustom(2)) == null || (y17 = pVar.y()) == null) {
                return;
            }
            fg2.s1 s1Var3 = pVar.f308510o;
            if (s1Var3 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            com.tencent.mm.plugin.finder.live.view.GuideSquareLivingCardView liveThree = s1Var3.f262302h;
            kotlin.jvm.internal.o.f(liveThree, "liveThree");
            c50.m0.a(y17, finderObject, liveThree, null, null, null, false, 60, null);
        }
    }
}
