package jk3;

/* loaded from: classes8.dex */
public final class k implements jk3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk3.v f300091a;

    public k(jk3.v vVar) {
        this.f300091a = vVar;
    }

    @Override // jk3.d
    public void a(int i17, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        java.lang.String str;
        jk3.v vVar = this.f300091a;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = vVar.f300077a;
        if (multiTaskInfo2 != null && multiTaskInfo != null) {
            if ((multiTaskInfo2 != null ? multiTaskInfo2.field_id : null) != null && (str = multiTaskInfo.field_id) != null) {
                kotlin.jvm.internal.o.d(multiTaskInfo2);
                if (kotlin.jvm.internal.o.b(str, multiTaskInfo2.field_id)) {
                    vVar.Y(i17, multiTaskInfo);
                    return;
                }
                return;
            }
        }
        vVar.Y(i17, multiTaskInfo);
    }
}
