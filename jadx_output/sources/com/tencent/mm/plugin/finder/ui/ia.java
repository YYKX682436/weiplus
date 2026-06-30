package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ia extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI f129357g;

    public ia(com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI finderMediaPreviewUI) {
        this.f129357g = finderMediaPreviewUI;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return event instanceof ec2.f;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        ec2.f fVar = ev6 instanceof ec2.f ? (ec2.f) ev6 : null;
        if (fVar == null) {
            return;
        }
        int i17 = com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI.D;
        com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI finderMediaPreviewUI = this.f129357g;
        finderMediaPreviewUI.d7().post(new com.tencent.mm.plugin.finder.ui.ha(fVar, finderMediaPreviewUI));
    }
}
