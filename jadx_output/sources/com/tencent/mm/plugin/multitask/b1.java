package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f150420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150421e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(int i17, java.lang.String str) {
        super(1);
        this.f150420d = i17;
        this.f150421e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        ik3.r rVar = (ik3.r) obj;
        if (rVar.f291912b == this.f150420d) {
            if (kotlin.jvm.internal.o.b(rVar.f291911a, this.f150421e)) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
