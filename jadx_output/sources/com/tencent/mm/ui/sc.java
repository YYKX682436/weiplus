package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class sc implements al5.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragment f209783d;

    public sc(com.tencent.mm.ui.MMFragment mMFragment) {
        this.f209783d = mMFragment;
    }

    @Override // al5.f3
    public void onCancel() {
        this.f209783d.onCancelDrag();
    }

    @Override // al5.f3
    public void onDrag() {
        this.f209783d.onDragBegin();
    }

    @Override // al5.f3
    public void onSwipeBack() {
        this.f209783d.onSwipeBack();
    }
}
