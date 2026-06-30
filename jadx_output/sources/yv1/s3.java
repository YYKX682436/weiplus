package yv1;

/* loaded from: classes12.dex */
public final class s3 extends com.tencent.mm.sdk.event.n {
    public s3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WxFileIndexDirtyEvent event = (com.tencent.mm.autogen.events.WxFileIndexDirtyEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.v20 v20Var = event.f54994g;
        long j17 = v20Var.f8167a;
        if (j17 <= 0) {
            return true;
        }
        java.lang.String str = v20Var.f8168b;
        if (str == null) {
            str = "talker-ignore";
        }
        mt1.b0.f331191a.r(j17, str);
        return true;
    }
}
