package uk3;

/* loaded from: classes8.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitask.model.MultiTaskInfo f428524d;

    public a(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfoObj) {
        kotlin.jvm.internal.o.g(multiTaskInfoObj, "multiTaskInfoObj");
        this.f428524d = multiTaskInfoObj;
    }

    @Override // in5.c
    public long getItemId() {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f428524d;
        return multiTaskInfo.field_id.hashCode() + java.lang.Integer.hashCode(multiTaskInfo.field_type);
    }

    @Override // in5.c
    public int h() {
        return this.f428524d.field_type;
    }
}
