package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class q0 implements a75.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f199732a;

    public q0(com.tencent.mm.storage.f9 msgInfo, android.view.View itemView) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f199732a = kz5.c1.l(new jz5.l(msgInfo, itemView));
    }

    @Override // a75.a
    /* renamed from: getKey */
    public java.lang.String get_key() {
        return "RecordEvent";
    }

    @Override // a75.a
    public a75.a mergeEvent(a75.a newEvent) {
        kotlin.jvm.internal.o.g(newEvent, "newEvent");
        if (newEvent instanceof com.tencent.mm.ui.chatting.component.q0) {
            this.f199732a.putAll(((com.tencent.mm.ui.chatting.component.q0) newEvent).f199732a);
        }
        return this;
    }
}
