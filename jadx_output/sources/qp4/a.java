package qp4;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.timelineeditor.view.TimelineEditorDragRectView f365829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.vlog.ui.timelineeditor.view.TimelineEditorDragRectView timelineEditorDragRectView) {
        super(0);
        this.f365829d = timelineEditorDragRectView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.vlog.ui.timelineeditor.view.TimelineEditorDragRectView timelineEditorDragRectView = this.f365829d;
        return new android.view.GestureDetector(timelineEditorDragRectView.getContext(), timelineEditorDragRectView);
    }
}
