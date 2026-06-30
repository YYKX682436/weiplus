package ei4;

/* loaded from: classes8.dex */
public final class k implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f253223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.AdapterView.AdapterContextMenuInfo f253224e;

    public k(boolean z17, android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo) {
        this.f253223d = z17;
        this.f253224e = adapterContextMenuInfo;
    }

    @Override // c01.da
    public boolean a() {
        return false;
    }

    @Override // c01.da
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusConversationLongClickListener", "longclick delete msg finish");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusConversationLongClickListener", "[CONTEXT_MENU_LONG_CLICK_DELETE] ret" + this.f253223d + " position=" + this.f253224e.position);
    }
}
