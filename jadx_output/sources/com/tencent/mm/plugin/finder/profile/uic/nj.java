package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class nj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f124017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(com.tencent.mm.plugin.finder.profile.uic.dk dkVar) {
        super(1);
        this.f124017d = dkVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.util.Iterator it = this.f124017d.O6().iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((so2.j5) it.next()).getItemId() == longValue) {
                break;
            }
            i17++;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
