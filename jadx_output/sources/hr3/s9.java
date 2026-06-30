package hr3;

/* loaded from: classes5.dex */
public class s9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference f283972e;

    public s9(com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference, java.lang.String str) {
        this.f283972e = normalProfileHeaderPreference;
        this.f283971d = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            com.tencent.mm.sdk.platformtools.b0.e(this.f283971d);
            android.content.Context context = this.f283972e.R;
            db5.e1.W(context, context.getString(com.tencent.mm.R.string.f490361st));
        }
    }
}
