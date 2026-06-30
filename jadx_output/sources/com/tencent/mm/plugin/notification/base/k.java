package com.tencent.mm.plugin.notification.base;

/* loaded from: classes15.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f152453a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f152454b;

    public k() {
        this.f152454b = 0;
        this.f152454b = 0;
    }

    public com.tencent.mm.plugin.msg.MsgIdTalker a() {
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = com.tencent.mm.plugin.msg.MsgIdTalker.f149479g;
        if (!this.f152453a.isEmpty() && this.f152454b < this.f152453a.size()) {
            msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) this.f152453a.get(this.f152454b);
        }
        long j17 = msgIdTalker.f149480d;
        this.f152453a.size();
        this.f152454b++;
        return msgIdTalker;
    }

    public int b() {
        return this.f152453a.size();
    }
}
