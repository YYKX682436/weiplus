package com.tencent.mm.ui.chatting.history.media;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/media/MsgHistoryGalleryMediaLoadGroup;", "Lcom/tencent/mm/sdk/coroutines/task/group/WorkerPoolWeTaskGroup;", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/y;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MsgHistoryGalleryMediaLoadGroup extends com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup {

    /* renamed from: n, reason: collision with root package name */
    public final int f201805n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f201806o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGalleryMediaLoadGroup(androidx.lifecycle.y lifecycleOwner) {
        super(lifecycleOwner);
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f201805n = 8;
        this.f201806o = jz5.h.b(new zc5.n(lifecycleOwner));
    }

    @Override // com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup
    public java.lang.String f() {
        return "MicroMsg.MsgHistoryGalleryMediaLoadGroup";
    }

    @Override // com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup
    public com.tencent.mm.sdk.coroutines.LifecycleScope g() {
        return (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f201806o).getValue();
    }

    @Override // com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup
    /* renamed from: h, reason: from getter */
    public int getF201805n() {
        return this.f201805n;
    }

    @Override // x65.a
    public java.lang.String name() {
        return "MsgHistoryGalleryMediaLoadGroup";
    }
}
