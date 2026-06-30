package l02;

/* loaded from: classes8.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f314797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f314798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314799f;

    public a(l02.k kVar, android.content.DialogInterface.OnClickListener onClickListener, com.tencent.mm.pointers.PBool pBool, java.lang.String str) {
        this.f314797d = onClickListener;
        this.f314798e = pBool;
        this.f314799f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.DialogInterface.OnClickListener onClickListener = this.f314797d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i17);
        }
        this.f314798e.value = true;
        o02.a.b(15, com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t.CTRL_INDEX, 1, 23, this.f314799f, "", "");
    }
}
