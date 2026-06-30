package wl3;

/* loaded from: classes10.dex */
public final class j implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar f447068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f447069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f447070f;

    public j(com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar musicMainSeekBar, kotlin.jvm.internal.h0 h0Var, android.graphics.drawable.Drawable drawable) {
        this.f447068d = musicMainSeekBar;
        this.f447069e = h0Var;
        this.f447070f = drawable;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        if (z17) {
            wl3.g gVar = com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar.f150822h;
            com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar musicMainSeekBar = this.f447068d;
            musicMainSeekBar.a(i17);
            if (seekBar == null || musicMainSeekBar.f150824e == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvItemConvert", "onSeekBarChange " + seekBar.getProgress() + ' ' + seekBar.getMax());
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar musicMainSeekBar = this.f447068d;
        musicMainSeekBar.setSeeking(true);
        musicMainSeekBar.a(seekBar != null ? seekBar.getProgress() : 0);
        wl3.h hVar = musicMainSeekBar.f150824e;
        if (hVar != null) {
            lm3.z zVar = (lm3.z) hVar;
            lm3.b0 b0Var = zVar.f319524a;
            androidx.appcompat.app.AppCompatActivity activity = b0Var.f319470e;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC.class)).Q6();
            r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(b0Var.f319470e, 7, r45.bt4.class);
            if (bt4Var != null) {
                bt4Var.f371043n = 1;
            }
            zVar.f319525b.itemView.removeCallbacks(b0Var.f319472g);
        }
        if (seekBar == null) {
            return;
        }
        seekBar.setThumb((android.graphics.drawable.Drawable) this.f447069e.f310123d);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar musicMainSeekBar = this.f447068d;
        musicMainSeekBar.setSeeking(false);
        if (seekBar != null) {
            wl3.h hVar = musicMainSeekBar.f150824e;
            if (hVar != null) {
                int progress = seekBar.getProgress();
                int max = seekBar.getMax();
                lm3.z zVar = (lm3.z) hVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvItemConvert", "onSeekEnd, seekPosition:" + progress + ", max:" + max);
                b21.m.h(progress);
                float duration = ((float) kl3.t.g().a().getDuration()) * (((float) progress) / ((float) max));
                androidx.recyclerview.widget.k3 k3Var = zVar.f319525b;
                android.view.KeyEvent.Callback findViewById = k3Var.itemView.findViewById(com.tencent.mm.R.id.k0o);
                pk4.c cVar = findViewById instanceof pk4.c ? (pk4.c) findViewById : null;
                if (cVar != null) {
                    ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).d(a06.d.c(duration));
                }
                b21.m.g();
                k3Var.itemView.postDelayed(zVar.f319524a.f319472g, 3000L);
            }
            seekBar.setThumb(this.f447070f);
        }
    }
}
