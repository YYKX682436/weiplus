package t82;

/* loaded from: classes12.dex */
public final class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t82.r f416395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f416396e;

    public m(t82.r rVar, java.util.ArrayList arrayList) {
        this.f416395d = rVar;
        this.f416396e = arrayList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.ec.h(this.f416395d.getContext(), 4106, this.f416396e);
    }
}
