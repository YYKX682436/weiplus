package su3;

/* loaded from: classes5.dex */
public abstract class f extends androidx.recyclerview.widget.k3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(su3.m mVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        itemView.setOnClickListener(new su3.e(this, mVar, itemView));
    }

    public void i(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
    }
}
