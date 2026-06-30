package fr5;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f265977a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f265978b;

    /* renamed from: c, reason: collision with root package name */
    public final fr5.b f265979c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.GestureDetector f265980d;

    /* renamed from: e, reason: collision with root package name */
    public final fr5.m f265981e;

    public j0(android.view.View view, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, yz5.l onSingleTapConfirmedCallback, yz5.l onLongPressCallback, yz5.l onDoubleTapPressCallback, yz5.l onDoubleTapUpCallback, yz5.p canDrag, yz5.r onGestureCallback, yz5.l onEndCallback, int i17, kotlin.jvm.internal.i iVar) {
        yz5.l lVar4 = (i17 & 2) != 0 ? null : lVar;
        yz5.l lVar5 = (i17 & 4) != 0 ? null : lVar2;
        yz5.l lVar6 = (i17 & 8) != 0 ? null : lVar3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(onSingleTapConfirmedCallback, "onSingleTapConfirmedCallback");
        kotlin.jvm.internal.o.g(onLongPressCallback, "onLongPressCallback");
        kotlin.jvm.internal.o.g(onDoubleTapPressCallback, "onDoubleTapPressCallback");
        kotlin.jvm.internal.o.g(onDoubleTapUpCallback, "onDoubleTapUpCallback");
        kotlin.jvm.internal.o.g(canDrag, "canDrag");
        kotlin.jvm.internal.o.g(onGestureCallback, "onGestureCallback");
        kotlin.jvm.internal.o.g(onEndCallback, "onEndCallback");
        this.f265979c = new fr5.b(new fr5.g0(this, lVar4, onDoubleTapUpCallback, lVar5, lVar6));
        this.f265980d = new android.view.GestureDetector(view.getContext(), new fr5.i0(onSingleTapConfirmedCallback, onLongPressCallback, this, onDoubleTapPressCallback));
        this.f265981e = new fr5.m(view, canDrag, new fr5.h0(this, onGestureCallback, onEndCallback));
    }
}
