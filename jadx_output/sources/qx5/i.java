package qx5;

/* loaded from: classes13.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.debug.FragmentPlugin f367496d;

    public i(com.tencent.xweb.debug.FragmentPlugin fragmentPlugin) {
        this.f367496d = fragmentPlugin;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        by5.a1.b(this.f367496d.getContext(), "xweb_debug_info", qx5.u.e());
    }
}
