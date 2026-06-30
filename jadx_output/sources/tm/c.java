package tm;

/* loaded from: classes11.dex */
public class c implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f420419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f420420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f420421c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm.a f420422d;

    public c(tm.a aVar, android.content.DialogInterface.OnClickListener onClickListener, android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener2) {
        this.f420422d = aVar;
        this.f420419a = onClickListener;
        this.f420420b = context;
        this.f420421c = onClickListener2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (!z17) {
            android.content.DialogInterface.OnClickListener onClickListener = this.f420421c;
            if (onClickListener != null) {
                onClickListener.onClick(null, -2);
                return;
            }
            return;
        }
        android.content.DialogInterface.OnClickListener onClickListener2 = this.f420419a;
        if (onClickListener2 != null) {
            onClickListener2.onClick(null, -1);
            return;
        }
        cm5.c.f43426a.a(this.f420420b, this.f420422d.f420398a);
    }
}
