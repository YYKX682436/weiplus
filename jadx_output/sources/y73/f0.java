package y73;

/* loaded from: classes11.dex */
public class f0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f459719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y73.d0 f459720e;

    public f0(y73.d0 d0Var, android.content.Context context) {
        this.f459720e = d0Var;
        this.f459719d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f459719d.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_before_install", this.f459720e.f459706d.f142414m).apply();
    }
}
