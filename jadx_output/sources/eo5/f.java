package eo5;

/* loaded from: classes8.dex */
public final class f implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.voipmp.support.VoipDetailActivity f255597d;

    public f(com.tencent.mm.voipmp.support.VoipDetailActivity voipDetailActivity) {
        this.f255597d = voipDetailActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f255597d.finish();
        return false;
    }
}
