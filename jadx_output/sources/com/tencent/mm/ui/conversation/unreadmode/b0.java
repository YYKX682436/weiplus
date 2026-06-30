package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.d0 f208113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.ui.conversation.unreadmode.d0 d0Var) {
        super(0);
        this.f208113d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f208113d.f208119g;
        if (context != null) {
            return com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.check_mark_filled, -1);
        }
        kotlin.jvm.internal.o.o("mContext");
        throw null;
    }
}
