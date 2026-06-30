package zu3;

/* loaded from: classes10.dex */
public final class i implements zu3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer f475809a;

    public i(com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer editorItemContainer) {
        this.f475809a = editorItemContainer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zu3.f
    public void a(android.view.View itemView, android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer editorItemContainer = this.f475809a;
        if (editorItemContainer.L) {
            editorItemContainer.g();
            int actionMasked = event.getActionMasked();
            java.lang.Runnable runnable = editorItemContainer.C;
            if (actionMasked == 0) {
                editorItemContainer.removeCallbacks(runnable);
                if ((itemView instanceof zu3.z) || (itemView instanceof zu3.c0)) {
                    editorItemContainer.h(itemView, false);
                    return;
                } else {
                    editorItemContainer.h(itemView, true);
                    return;
                }
            }
            android.view.ViewGroup viewGroup = editorItemContainer.f156130s;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    boolean z17 = itemView instanceof zu3.c0;
                    if (!(z17 || (itemView instanceof zu3.z) || editorItemContainer.f156125J != 0) && (itemView instanceof cw3.s)) {
                        float[] contentBoundary = ((cw3.s) itemView).getContentBoundary();
                        float f17 = contentBoundary[0];
                        float f18 = contentBoundary[1];
                        float f19 = contentBoundary[2];
                        float f27 = contentBoundary[3];
                        android.graphics.Rect rect = lt3.n.f321262c;
                        boolean z18 = f17 <= ((float) rect.left);
                        com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView = editorItemContainer.f156131t;
                        if (editorFrameView != null) {
                            editorFrameView.setVisibility(z18 ? 0 : 4);
                        }
                        boolean z19 = f18 <= ((float) rect.top);
                        com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView2 = editorItemContainer.f156132u;
                        if (editorFrameView2 != null) {
                            editorFrameView2.setVisibility(z19 ? 0 : 4);
                        }
                        boolean z27 = f19 >= ((float) rect.right);
                        com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView3 = editorItemContainer.f156133v;
                        if (editorFrameView3 != null) {
                            editorFrameView3.setVisibility(z27 ? 0 : 4);
                        }
                        boolean z28 = f27 >= ((float) rect.bottom);
                        com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView4 = editorItemContainer.f156134w;
                        if (editorFrameView4 != null) {
                            editorFrameView4.setVisibility(z28 ? 0 : 4);
                        }
                    }
                    if (z17 || (itemView instanceof zu3.z)) {
                        return;
                    }
                    int pointerCount = event.getPointerCount();
                    float f28 = 0.0f;
                    float f29 = 0.0f;
                    for (int i17 = 0; i17 < pointerCount; i17++) {
                        f28 += event.getY(i17);
                        f29 += event.getX(i17);
                    }
                    float f37 = pointerCount;
                    float f38 = f29 / f37;
                    if (viewGroup.getTop() > 0 && f28 / f37 > ((float) viewGroup.getTop()) && ((float) viewGroup.getLeft()) < f38 && ((float) viewGroup.getRight()) > f38) {
                        editorItemContainer.d(true);
                        if (editorItemContainer.f156136y == null) {
                            editorItemContainer.f156136y = itemView;
                            itemView.animate().alpha(0.5f).setDuration(100L).start();
                        }
                    } else {
                        editorItemContainer.d(false);
                        if (editorItemContainer.f156136y != null) {
                            editorItemContainer.f156136y = null;
                            itemView.animate().alpha(1.0f).setDuration(100L).start();
                        }
                    }
                    viewGroup.setVisibility(0);
                    yz5.l lVar = editorItemContainer.deleteStateListener;
                    if (lVar != null) {
                        lVar.invoke(java.lang.Boolean.TRUE);
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    return;
                }
            }
            boolean z29 = itemView instanceof zu3.l;
            boolean z37 = itemView instanceof zu3.b0;
            boolean z38 = itemView instanceof zu3.z;
            if (editorItemContainer.f156136y != null) {
                editorItemContainer.post(new zu3.h(editorItemContainer, itemView));
            } else if (editorItemContainer.B != null) {
                editorItemContainer.postDelayed(runnable, 1500L);
            }
            viewGroup.setVisibility(8);
            yz5.l lVar2 = editorItemContainer.deleteStateListener;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.FALSE);
            }
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView5 = editorItemContainer.f156131t;
            if (editorFrameView5 != null) {
                editorFrameView5.setVisibility(4);
            }
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView6 = editorItemContainer.f156132u;
            if (editorFrameView6 != null) {
                editorFrameView6.setVisibility(4);
            }
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView7 = editorItemContainer.f156133v;
            if (editorFrameView7 != null) {
                editorFrameView7.setVisibility(4);
            }
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorFrameView editorFrameView8 = editorItemContainer.f156134w;
            if (editorFrameView8 == null) {
                return;
            }
            editorFrameView8.setVisibility(4);
        }
    }
}
