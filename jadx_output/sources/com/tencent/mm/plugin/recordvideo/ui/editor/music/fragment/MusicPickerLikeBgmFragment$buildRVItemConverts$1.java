package com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerLikeBgmFragment$buildRVItemConverts$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MusicPickerLikeBgmFragment$buildRVItemConverts$1 implements in5.s {
    final /* synthetic */ yz5.p $itemViewBindCallback;
    final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment this$0;

    public MusicPickerLikeBgmFragment$buildRVItemConverts$1(yz5.p pVar, com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment musicPickerLikeBgmFragment) {
        this.$itemViewBindCallback = pVar;
        this.this$0 = musicPickerLikeBgmFragment;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        if (type == 2) {
            return new rv3.k();
        }
        yz5.p pVar = this.$itemViewBindCallback;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment musicPickerLikeBgmFragment = this.this$0;
        musicPickerLikeBgmFragment.getClass();
        return new rv3.i(pVar, musicPickerLikeBgmFragment, this.this$0.l0(), this.this$0.getS1());
    }
}
