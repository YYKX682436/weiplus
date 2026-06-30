package g63;

/* loaded from: classes8.dex */
public final class k implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f269133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.AdapterView.AdapterContextMenuInfo f269134e;

    public k(boolean z17, android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo) {
        this.f269133d = z17;
        this.f269134e = adapterContextMenuInfo;
    }

    @Override // c01.da
    public boolean a() {
        return false;
    }

    @Override // c01.da
    public void c() {
        com.tencent.mars.xlog.Log.i("GameLife.ConversationOnLongClickListener", "longclick delete msg finish [CONTEXT_MENU_LONG_CLICK_DELETE] ret=" + this.f269133d + " position=" + this.f269134e.position);
    }
}
