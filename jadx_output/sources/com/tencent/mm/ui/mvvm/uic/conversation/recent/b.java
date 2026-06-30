package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f209264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f209265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f209266f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, kotlin.jvm.internal.f0 f0Var, long j17) {
        super(1);
        this.f209264d = i17;
        this.f209265e = f0Var;
        this.f209266f = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String toUserName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        return "{\"msg_type\": " + this.f209264d + "; \"inner_msg_type\": " + this.f209265e.f310116d + "; \"send_time\": " + this.f209266f + "; \"toUserid\": " + toUserName + '}';
    }
}
