package sl1;

/* loaded from: classes5.dex */
public class a implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.music.MusicSeekBar f409229d;

    public a(com.tencent.mm.plugin.appbrand.widget.music.MusicSeekBar musicSeekBar) {
        this.f409229d = musicSeekBar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        this.f409229d.f91761h = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        com.tencent.mm.plugin.appbrand.widget.music.MusicSeekBar musicSeekBar = this.f409229d;
        musicSeekBar.f91761h = false;
        sl1.c cVar = musicSeekBar.f91765o;
        if (cVar != null) {
            int progress = seekBar.getProgress();
            com.tencent.mm.plugin.music.ui.y yVar = (com.tencent.mm.plugin.music.ui.y) cVar;
            yVar.getClass();
            b21.m.h(progress);
            com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI = yVar.f150855a;
            musicMainUI.f150705g.setProgress(progress);
            musicMainUI.f150705g.a(true);
        }
    }
}
