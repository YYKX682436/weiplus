package qx5;

/* loaded from: classes13.dex */
public class g implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.debug.FragmentInfo f367491d;

    public g(com.tencent.xweb.debug.FragmentInfo fragmentInfo) {
        this.f367491d = fragmentInfo;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.tencent.xweb.debug.FragmentInfo fragmentInfo = this.f367491d;
        by5.a1.b(fragmentInfo.getContext(), "xweb_debug_info", fragmentInfo.f220249e.getText().toString());
        android.widget.Toast.makeText(fragmentInfo.getContext(), "已复制到剪贴板", 0).show();
        return true;
    }
}
