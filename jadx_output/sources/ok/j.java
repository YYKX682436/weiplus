package ok;

/* loaded from: classes10.dex */
public final class j extends ok.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bn5.f layer) {
        super(layer);
        kotlin.jvm.internal.o.g(layer, "layer");
    }

    @Override // ok.p
    public android.graphics.Rect a() {
        android.graphics.Rect boardRect = this.f345954c.getBoardRect();
        android.graphics.Rect rect = new android.graphics.Rect();
        int height = (int) ((boardRect.height() - (boardRect.width() * 0.9f)) / 2.0f);
        rect.top = height;
        rect.bottom = height;
        return new android.graphics.Rect(boardRect.left + rect.left, boardRect.top + rect.top, boardRect.right - rect.right, boardRect.bottom - rect.bottom);
    }
}
