package com.tencent.mm.plugin.finder.live.multistream.adapter;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/multistream/adapter/MultiStreamItemConvertFactory;", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "Ltk2/a;", "service", "Ltk2/a;", "getService", "()Ltk2/a;", "<init>", "(Ltk2/a;)V", "sk2/a", "sk2/b", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MultiStreamItemConvertFactory implements in5.s {
    private final tk2.a service;

    public MultiStreamItemConvertFactory(tk2.a service) {
        kotlin.jvm.internal.o.g(service, "service");
        this.service = service;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        return new sk2.b(this);
    }

    public final tk2.a getService() {
        return this.service;
    }
}
