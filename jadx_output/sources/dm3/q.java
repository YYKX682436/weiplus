package dm3;

/* loaded from: classes10.dex */
public final class q implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dm3.u f241733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f241734b;

    public q(dm3.u uVar, android.widget.FrameLayout frameLayout) {
        this.f241733a = uVar;
        this.f241734b = frameLayout;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        if (((i17 == 0 && fVar.f70616b == 0) || hc2.p.b(i17, fVar.f70616b)) && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2)) != null) {
            dm3.u uVar = this.f241733a;
            android.widget.FrameLayout frameLayout = this.f241734b;
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
            bu2.j.f24534a.n(a17, bu2.i.f24531l);
            uVar.f241741e = a17.getUserName();
            com.tencent.mm.protocal.protobuf.FinderContact contact = a17.getFeedObject().getContact();
            ((ku5.t0) ku5.t0.f312615d).B(new dm3.p(uVar, frameLayout, contact != null ? contact.getHeadUrl() : null));
        }
        return jz5.f0.f302826a;
    }
}
