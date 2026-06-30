package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public final class op implements d90.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cf5.b f199657a;

    public op(cf5.b bVar) {
        this.f199657a = bVar;
    }

    @Override // d90.j
    public void a(java.util.ArrayList contentList) {
        kotlin.jvm.internal.o.g(contentList, "contentList");
        try {
            this.f199657a.a(contentList);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeClawStream.ChattingComponent", th6, "Failed to append text in stream parse", new java.lang.Object[0]);
            throw th6;
        }
    }

    @Override // d90.j
    public void b() {
    }
}
