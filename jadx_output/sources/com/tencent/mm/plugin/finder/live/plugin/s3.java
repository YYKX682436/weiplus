package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f114210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f114211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        super(0);
        this.f114210d = linkedList;
        this.f114211e = v3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj = null;
        java.util.LinkedList linkedList = this.f114210d;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (!zl2.r4.f473950a.u1((r45.f62) next)) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.f62) obj;
        }
        boolean z17 = obj == null;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f114211e;
        if (z17) {
            v3Var.f114645r.setTextColor(v3Var.f114646s.getContext().getColor(com.tencent.mm.R.color.f478553an));
        } else {
            v3Var.f114645r.setTextColor(v3Var.f114646s.getContext().getColor(com.tencent.mm.R.color.f478554ao));
        }
        return jz5.f0.f302826a;
    }
}
