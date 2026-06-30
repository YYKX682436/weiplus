package com.tencent.mm.plugin.voiceprint.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class VoicePrintCreateFinishUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f176201f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f176202d = jz5.h.b(new com.tencent.mm.plugin.voiceprint.ui.a0(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f176203e = jz5.h.b(new com.tencent.mm.plugin.voiceprint.ui.e0(this));

    public final fq.e T6() {
        return (fq.e) ((jz5.n) this.f176202d).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d4f;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackBtn(new com.tencent.mm.plugin.voiceprint.ui.d0(this), com.tencent.mm.R.raw.actionbar_icon_dark_close);
        com.tencent.mm.ui.bk.s0(T6().f265429c.getPaint());
        com.tencent.mm.ui.bk.s0(T6().f265428b.getPaint());
        com.tencent.mm.ui.bk.s0(T6().f265430d.getPaint());
        T6().f265430d.setOnClickListener(new com.tencent.mm.plugin.voiceprint.ui.b0(this));
        T6().f265428b.setOnClickListener(new com.tencent.mm.plugin.voiceprint.ui.c0(this));
        switch (((java.lang.Number) ((jz5.n) this.f176203e).getValue()).intValue()) {
            case 72:
                T6().f265429c.setText(getString(com.tencent.mm.R.string.k9s));
                T6().f265428b.setVisibility(0);
                return;
            case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
                T6().f265429c.setText(getString(com.tencent.mm.R.string.k9r));
                T6().f265428b.setVisibility(8);
                return;
            case 74:
            default:
                T6().f265429c.setVisibility(8);
                T6().f265428b.setVisibility(8);
                return;
            case 75:
                android.widget.ImageView imageView = T6().f265431e;
                android.graphics.drawable.Drawable drawable = getDrawable(com.tencent.mm.R.raw.icons_outlined_error);
                com.tencent.mm.ui.uk.f(drawable, getResources().getColor(com.tencent.mm.R.color.Yellow_100));
                imageView.setBackground(drawable);
                T6().f265429c.setText(getString(com.tencent.mm.R.string.k9z));
                T6().f265430d.setText(getString(com.tencent.mm.R.string.k_0));
                T6().f265428b.setVisibility(8);
                return;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                android.widget.ImageView imageView2 = T6().f265431e;
                android.graphics.drawable.Drawable drawable2 = getDrawable(com.tencent.mm.R.raw.icons_outlined_error);
                com.tencent.mm.ui.uk.f(drawable2, getResources().getColor(com.tencent.mm.R.color.Yellow_100));
                imageView2.setBackground(drawable2);
                T6().f265429c.setText(getString(com.tencent.mm.R.string.k9v));
                T6().f265430d.setText(getString(com.tencent.mm.R.string.f490454vi));
                T6().f265428b.setVisibility(8);
                return;
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
                android.widget.ImageView imageView3 = T6().f265431e;
                android.graphics.drawable.Drawable drawable3 = getDrawable(com.tencent.mm.R.raw.icons_outlined_error);
                com.tencent.mm.ui.uk.f(drawable3, getResources().getColor(com.tencent.mm.R.color.Yellow_100));
                imageView3.setBackground(drawable3);
                T6().f265429c.setText(getString(com.tencent.mm.R.string.k9w));
                T6().f265430d.setText(getString(com.tencent.mm.R.string.f490454vi));
                T6().f265428b.setVisibility(8);
                return;
        }
    }
}
