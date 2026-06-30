package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f124705d;

    /* renamed from: e, reason: collision with root package name */
    public int f124706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.m3 f124707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.e4 f124708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124709h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.tencent.mm.plugin.finder.profile.widget.m3 m3Var, com.tencent.mm.plugin.finder.profile.widget.e4 e4Var, com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f124707f = m3Var;
        this.f124708g = e4Var;
        this.f124709h = s4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.profile.widget.r3(this.f124707f, this.f124708g, this.f124709h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.profile.widget.r3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f124706e;
        com.tencent.mm.plugin.finder.profile.widget.m3 m3Var = this.f124707f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z18 = m3Var.f124624a.getBoolean(15);
            this.f124705d = z18;
            this.f124706e = 1;
            com.tencent.mm.plugin.finder.profile.widget.e4 e4Var = this.f124708g;
            e4Var.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            s40.o0 o0Var = (s40.o0) i95.n0.c(s40.o0.class);
            r45.hx0 hx0Var = new r45.hx0();
            r45.t02 t02Var = new r45.t02();
            r45.h32 h32Var = m3Var.f124624a;
            t02Var.set(0, h32Var.getString(4));
            t02Var.set(3, java.lang.Integer.valueOf(h32Var.getBoolean(15) ? 2 : 1));
            hx0Var.set(0, 10);
            hx0Var.set(1, com.tencent.mm.protobuf.g.b(t02Var.toByteArray()));
            pq5.g l17 = ((com.tencent.mm.feature.finder.live.a) o0Var).wi(0L, 0L, 7, hx0Var).l();
            l17.K(new com.tencent.mm.plugin.finder.profile.widget.o3(nVar));
            android.content.Context context = e4Var.f124530f;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) context);
            if (nVar.a() == aVar) {
                return aVar;
            }
            z17 = z18;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z17 = this.f124705d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String string = m3Var.f124624a.getString(4);
        if (string == null) {
            string = "";
        }
        boolean z19 = !z17;
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124709h;
        java.util.List list = s4Var.f124760n;
        if (z19) {
            int i18 = ((com.tencent.mm.plugin.finder.profile.widget.m3) kz5.n0.X(list)).f124624a.getBoolean(15) ? com.tencent.mm.R.string.f492696oc5 : com.tencent.mm.R.string.oc8;
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.h(context2, context2.getString(i18));
        } else {
            android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.m(context3, context3.getString(com.tencent.mm.R.string.f492678oc0));
        }
        s4Var.f124767u = true;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new com.tencent.mm.plugin.finder.profile.widget.r4());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r45.h32 h32Var2 = ((com.tencent.mm.plugin.finder.profile.widget.m3) it.next()).f124624a;
            h32Var2.set(15, java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(h32Var2.getString(4), string) && z19));
            if (h32Var2.getBoolean(15)) {
                arrayList2.add(0, new com.tencent.mm.plugin.finder.profile.widget.m3(s4Var, h32Var2));
            } else {
                arrayList2.add(new com.tencent.mm.plugin.finder.profile.widget.m3(s4Var, h32Var2));
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        s4Var.e();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            linkedList.add(((com.tencent.mm.plugin.finder.profile.widget.m3) it6.next()).f124624a);
        }
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        java.util.List list2 = com.tencent.mm.plugin.finder.feed.model.i1.f107933d;
        list2.clear();
        list2.addAll(linkedList);
        return jz5.f0.f302826a;
    }
}
