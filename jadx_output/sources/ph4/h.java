package ph4;

/* loaded from: classes8.dex */
public final class h implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f354480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f354481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph4.b f354482c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph4.j f354483d;

    public h(int i17, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, ph4.b bVar, ph4.j jVar) {
        this.f354480a = i17;
        this.f354481b = multiTaskInfo;
        this.f354482c = bVar;
        this.f354483d = jVar;
    }

    @Override // p11.k
    public final void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object[] objArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load snapshots done ");
        sb6.append(this.f354480a);
        sb6.append(' ');
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f354481b;
        sb6.append(multiTaskInfo.field_id);
        sb6.append(' ');
        sb6.append(bitmap);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionOtherViewBaseHelper", sb6.toString());
        ph4.b bVar = this.f354482c;
        bVar.f354462e.post(new ph4.g(bitmap, bVar, multiTaskInfo, this.f354483d));
    }
}
