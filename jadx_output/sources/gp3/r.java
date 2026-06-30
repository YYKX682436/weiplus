package gp3;

/* loaded from: classes9.dex */
public class r implements hp3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gp3.s f274386a;

    public r(gp3.s sVar) {
        this.f274386a = sVar;
    }

    @Override // hp3.a
    public void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener = this.f274386a.S;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
