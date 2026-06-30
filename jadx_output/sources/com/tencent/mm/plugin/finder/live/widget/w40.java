package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class w40 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.re2 f120142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w40(r45.re2 re2Var) {
        super(1);
        this.f120142d = re2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(this.f120142d.getList(2).contains((java.lang.String) obj));
    }
}
