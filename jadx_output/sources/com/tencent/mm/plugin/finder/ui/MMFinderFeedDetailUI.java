package com.tencent.mm.plugin.finder.ui;

@db5.a(128)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class MMFinderFeedDetailUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        int keyCode = event.getKeyCode();
        if (keyCode != 24) {
            if (keyCode == 25 && event.getAction() == 0) {
                com.tencent.mm.autogen.events.FinderVolumeKeyEvent finderVolumeKeyEvent = new com.tencent.mm.autogen.events.FinderVolumeKeyEvent();
                finderVolumeKeyEvent.f54339g.f7893a = 25;
                finderVolumeKeyEvent.e();
            }
        } else if (event.getAction() == 0) {
            com.tencent.mm.autogen.events.FinderVolumeKeyEvent finderVolumeKeyEvent2 = new com.tencent.mm.autogen.events.FinderVolumeKeyEvent();
            finderVolumeKeyEvent2.f54339g.f7893a = 24;
            finderVolumeKeyEvent2.e();
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f128811m = true;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.mb.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.j6.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.jb.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.z6.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.g7.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.e7.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.i7.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.b7.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.i6.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.d7.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.b9.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.w9.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.v5.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.fb.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.u5.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.w8.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.o7.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.y6.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.g8.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.c7.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.s5.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.j7.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.f7.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.t7.class)));
        set.add(com.tencent.mm.plugin.finder.report.u.class);
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(iz2.b.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.m9.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.l9.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.d9.class)));
        set.add(or2.f.class);
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.q7.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.f6.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.q5.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.f8.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.ua.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.pb.class)));
    }
}
