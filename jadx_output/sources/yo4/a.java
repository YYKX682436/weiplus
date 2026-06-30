package yo4;

/* loaded from: classes10.dex */
public final class a implements yo4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.LabelSlider f464167a;

    public a(com.tencent.mm.plugin.vlog.ui.LabelSlider labelSlider) {
        this.f464167a = labelSlider;
    }

    @Override // yo4.b
    public void a(int i17) {
        yo4.b callback = this.f464167a.getCallback();
        if (callback != null) {
            callback.a(i17);
        }
    }
}
