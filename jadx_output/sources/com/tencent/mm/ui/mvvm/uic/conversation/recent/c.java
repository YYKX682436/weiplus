package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f209274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f209275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f209276f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, long j17) {
        super(1);
        this.f209274d = f0Var;
        this.f209275e = f0Var2;
        this.f209276f = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String toUserName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        return "{\"msg_type\": " + this.f209274d.f310116d + "; \"inner_msg_type\": " + this.f209275e.f310116d + "; \"send_time\": " + this.f209276f + "; \"toUserid\": " + toUserName + '}';
    }
}
