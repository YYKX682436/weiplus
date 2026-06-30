package hr3;

/* loaded from: classes11.dex */
public final class gg extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f283594d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f283595e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f283596f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.DialogInterface.OnCancelListener f283597g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f283594d = getIntent().getStringExtra("Contact_User");
        this.f283597g = new hr3.bg(this);
    }

    public final void O6(java.lang.String remarkName, yz5.a callback) {
        kotlin.jvm.internal.o.g(remarkName, "remarkName");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.friend.RepairerConfigSetContactPropertySyncEnable()) == 1)) {
            callback.invoke();
            return;
        }
        java.lang.String str = this.f283594d;
        if (str == null) {
            callback.invoke();
        } else if (r26.n0.B(str, "@", false) && !com.tencent.mm.storage.z3.E4(str)) {
            callback.invoke();
        } else {
            this.f283595e = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.iin), true, true, this.f283597g);
            this.f283596f = kotlinx.coroutines.l.d(v65.m.b(getActivity()), kotlinx.coroutines.q1.f310570c, null, new hr3.fg(this, remarkName, callback, null), 2, null);
        }
    }
}
