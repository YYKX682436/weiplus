package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderShareFeedAffinityUI;", "Lcom/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI;", "Lru2/a;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderShareFeedAffinityUI extends com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI implements ru2.a {

    /* renamed from: t2, reason: collision with root package name */
    public static long f128753t2 = -1;

    /* renamed from: u2, reason: collision with root package name */
    public static long f128754u2;

    /* renamed from: v2, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.storage.FinderItem f128755v2;

    /* renamed from: q2, reason: collision with root package name */
    public boolean f128756q2;

    /* renamed from: r2, reason: collision with root package name */
    public long f128757r2;

    /* renamed from: s2, reason: collision with root package name */
    public long f128758s2;

    @Override // ru2.a
    public void C1(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.ui.ji(this));
    }

    public final boolean U7(com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.lang.String str) {
        if ((c01.z1.j() & 34359738368L) != 0) {
            return false;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127970uc).getValue()).r()).intValue();
        int i17 = (intValue != -3 ? intValue != -2 ? intValue != -1 ? intValue * 60 * 60 : 3 : 1800 : 120) * 1000;
        com.tencent.mars.xlog.Log.i("Finder.FinderShareFeedAffinityUI", "checkJump3tab onBackGroundTime " + this.f128758s2 + " intervals " + i17 + " source " + str);
        if (this.f128758s2 == 0 || i17 == 0 || c01.id.c() - this.f128758s2 <= i17) {
            return false;
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (finderObject != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderShareFeedAffinityUI", "jump finder " + finderObject.getId());
            pf5.u uVar = pf5.u.f353936a;
            ey2.o0 N6 = ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4);
            ey2.q0 q0Var = ey2.q0.f257472e;
            N6.a(q0Var);
            N6.f257449i = c01.id.c();
            ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4).a(q0Var);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
            intent.putExtra("KEY_FROM_SHARE_REL", true);
            intent.putExtra("KEY_TARGET_TAB_TYPE", 4);
            intent.putExtra("KEY_OBJECT_ID", finderObject.getId());
            intent.putExtra("KEY_OBJECT_NONCE_ID", finderObject.getObjectNonceId());
            intent.putExtra("insert_source_feed", true);
            com.tencent.mm.plugin.finder.report.v1.f125393a.d();
            bu2.j.f24534a.n(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0), bu2.i.f24531l);
            finish();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.ub.L7((c61.ub) c17, context, intent, 1, false, 8, null);
        }
        this.f128758s2 = 0L;
        return true;
    }

    @Override // ru2.a
    public void V4(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mars.xlog.Log.i("Finder.FinderShareFeedAffinityUI", "onFinderBackground");
        this.f128758s2 = c01.id.c();
        com.tencent.mars.xlog.Log.i("Finder.FinderShareFeedAffinityUI", "onStop save onBackGroundTime " + this.f128758s2);
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        boolean z17 = ((com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).f134505d;
        if (!this.f128756q2 || z17) {
            super.finish();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            j45.l.u(this, ".ui.LauncherUI", intent, null);
            overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.ui.ii(this));
        }
        this.f128758s2 = c01.id.c();
        com.tencent.mars.xlog.Log.i("Finder.FinderShareFeedAffinityUI", "finishAffinity isFromMultitask " + this.f128756q2 + " isFromFloatBall " + z17);
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI, com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI, com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        byte[] byteArray;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem;
        this.f128758s2 = bundle != null ? bundle.getLong("key_get_relative_restore_stop_time", 0L) : 0L;
        com.tencent.mars.xlog.Log.i(this.C, "restore onBackGroundTime " + this.f128758s2);
        java.lang.Long valueOf = bundle != null ? java.lang.Long.valueOf(bundle.getLong("feed_object_id", -1L)) : null;
        if (!(valueOf == null || valueOf.longValue() != -1)) {
            valueOf = null;
        }
        long longExtra = getIntent().getLongExtra("key_get_relative_open_time", -1L);
        if (longExtra == f128753t2 && (finderItem = f128755v2) != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderShareFeedAffinityUI", "restore lastOpen " + longExtra);
            getIntent().putExtra("feed_object_id", finderItem.getId());
            getIntent().putExtra("feed_encrypted_object_id", finderItem.getEncryptedObjectId());
            valueOf = java.lang.Long.valueOf(finderItem.getId());
            this.f128758s2 = f128754u2;
        } else if (valueOf != null) {
            long longValue = valueOf.longValue();
            com.tencent.mars.xlog.Log.i("Finder.FinderShareFeedAffinityUI", "restore saveInstance " + longValue);
            getIntent().putExtra("feed_object_id", longValue);
            getIntent().putExtra("feed_encrypted_object_id", bundle != null ? bundle.getString("feed_encrypted_object_id") : null);
        }
        super.onCreate(bundle);
        f128753t2 = getIntent().getLongExtra("key_get_relative_open_time", f128753t2);
        f128755v2 = null;
        setTaskDescription(new android.app.ActivityManager.TaskDescription(getContext().getString(com.tencent.mm.R.string.cfj), m95.a.a(getContext().getResources(), com.tencent.mm.R.raw.icons_filled_finder, 3.0f), 0));
        if (bundle != null && (byteArray = bundle.getByteArray("key_get_relative_restore_last_buff")) != null) {
            E7().setLastBuffer(new com.tencent.mm.protobuf.g(byteArray, 0, byteArray.length));
        }
        if (valueOf != null) {
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(valueOf.longValue());
            if (U7(h17 != null ? h17.getFeedObject() : null, "onCreate")) {
                return;
            }
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.g1 g1Var = (com.tencent.mm.plugin.finder.viewmodel.component.g1) pf5.z.f353948a.a(context).e(com.tencent.mm.plugin.finder.viewmodel.component.g1.class);
        if (g1Var != null) {
            g1Var.f134456e = false;
        }
        f128754u2 = 0L;
        ru2.j jVar = ru2.j.f399741d;
        ru2.j.f399746i.add(this);
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI, com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("Finder.FinderShareFeedAffinityUI", "onDestroy");
        ru2.j jVar = ru2.j.f399741d;
        ru2.j.f399746i.remove(this);
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI, com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (c01.id.c() - this.f128757r2 < 500) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f128780l2;
            U7(finderItem != null ? finderItem.getFeedObject() : null, "onResume");
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderShareFeedAffinityUI", "skip jump3tab");
        }
        this.f128758s2 = 0L;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        com.tencent.mm.protobuf.g lastBuffer = E7().getLastBuffer();
        outState.putByteArray("key_get_relative_restore_last_buff", lastBuffer != null ? lastBuffer.g() : null);
        outState.putLong("key_get_relative_restore_stop_time", this.f128758s2);
        com.tencent.mars.xlog.Log.i("Finder.FinderShareFeedAffinityUI", "onSaveInstanceState");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f128780l2;
        if (finderItem != null) {
            outState.putLong("feed_object_id", finderItem.getId());
            outState.putString("feed_encrypted_object_id", finderItem.getFeedObject().getObjectNonceId());
            com.tencent.mars.xlog.Log.i("Finder.FinderShareFeedAffinityUI", "store onBackGroundTime " + this.f128758s2 + " lastCenterFeed id " + pm0.v.u(finderItem.getId()) + " nonceId " + finderItem.getFeedObject().getObjectNonceId() + " pos " + this.f128781m2);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f128757r2 = c01.id.c();
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (f128753t2 == getIntent().getLongExtra("key_get_relative_open_time", -1L)) {
            f128755v2 = this.f128780l2;
            f128754u2 = c01.id.c();
        }
    }
}
