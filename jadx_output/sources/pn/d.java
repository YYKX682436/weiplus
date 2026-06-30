package pn;

/* loaded from: classes11.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn.m f356917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o65.d f356918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f356919f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f356920g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f356921h;

    public d(pn.m mVar, o65.d dVar, java.util.List list, java.util.List list2, java.util.List list3) {
        this.f356917d = mVar;
        this.f356918e = dVar;
        this.f356919f = list;
        this.f356920g = list2;
        this.f356921h = list3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        pn.m mVar = this.f356917d;
        if (com.tencent.mm.storage.z3.N4(mVar.f356931b)) {
            java.lang.String str = this.f356918e.f343218i;
            kotlin.jvm.internal.o.f(str, "getChatroomName(...)");
            mVar.e(str, this.f356919f);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f356920g);
        arrayList.addAll(this.f356921h);
        mVar.getClass();
        fd0.e eVar = (fd0.e) ((gd0.e) i95.n0.c(gd0.e.class));
        java.lang.String str2 = mVar.f356931b;
        com.tencent.mm.roomsdk.model.factory.a a17 = eVar.wi(str2).a(str2, arrayList, 0, mVar.f356933d);
        a17.f192246b = new pn.h(mVar);
        a17.f192247c = new pn.i(mVar);
        a17.c(mVar.f356930a, mVar.c(com.tencent.mm.R.string.f490573yv), mVar.c(com.tencent.mm.R.string.i4z), true, true, new pn.j(a17));
        ((y04.e) ((vg3.j4) i95.n0.c(vg3.j4.class))).wi(1);
        ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).Bi(mVar.f356934e, mVar.f356931b);
    }
}
