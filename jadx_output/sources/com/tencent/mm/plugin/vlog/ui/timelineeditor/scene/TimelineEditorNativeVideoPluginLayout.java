package com.tencent.mm.plugin.vlog.ui.timelineeditor.scene;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorNativeVideoPluginLayout;", "Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorBaseVideoPluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class TimelineEditorNativeVideoPluginLayout extends com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineEditorNativeVideoPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout
    public void A() {
        super.A();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        lp4.u uVar = (lp4.u) j(lp4.u.class);
        if (uVar != null && motionEvent != null) {
            uVar.f320428g.r(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        java.lang.Long valueOf;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo;
        lp4.u uVar;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 40) {
            if (ordinal != 112) {
                super.w(status, bundle);
                return;
            }
            if (bundle == null || (emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) bundle.getParcelable("PARAM_EDIT_EMOJI_INFO")) == null || (uVar = (lp4.u) j(lp4.u.class)) == null) {
                return;
            }
            rm5.j currentTrack = getCurrentTrack();
            valueOf = currentTrack != null ? java.lang.Long.valueOf(currentTrack.f397501c) : null;
            com.tencent.mm.timelineedit.TimelineEditor timelineEditor = uVar.f320428g;
            java.lang.String md52 = emojiInfo.getMd5();
            kotlin.jvm.internal.o.f(md52, "getMd5(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("scheme", "emoji");
                jSONObject.put("emoji_md5", md52);
            } catch (java.lang.Exception unused) {
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            uq5.w n17 = timelineEditor.n(jSONObject2);
            if (n17 != null) {
                if (valueOf != null) {
                    uVar.f320428g.k(n17, valueOf.longValue());
                    return;
                } else {
                    uVar.f320428g.j(n17, true);
                    return;
                }
            }
            return;
        }
        H();
        com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.F(this, null, 1, null);
        if (bundle != null) {
            java.lang.CharSequence charSequence = bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
            int i17 = bundle.getInt("PARAM_EDIT_TEXT_COLOR");
            int i18 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
            java.lang.String string = bundle.getString("PARAM_EDIT_TEXT_FONT");
            lp4.u uVar2 = (lp4.u) j(lp4.u.class);
            if (uVar2 != null) {
                java.lang.String valueOf2 = java.lang.String.valueOf(charSequence);
                rm5.j currentTrack2 = getCurrentTrack();
                valueOf = currentTrack2 != null ? java.lang.Long.valueOf(currentTrack2.f397501c) : null;
                com.tencent.mm.timelineedit.TimelineEditor timelineEditor2 = uVar2.f320428g;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("scheme", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
                    jSONObject3.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, valueOf2);
                    jSONObject3.put("font_color", i17);
                    jSONObject3.put("bg_color", i18);
                    jSONObject3.put("font_style", string);
                } catch (java.lang.Exception unused2) {
                }
                java.lang.String jSONObject4 = jSONObject3.toString();
                kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                uq5.w n18 = timelineEditor2.n(jSONObject4);
                if (n18 != null) {
                    if (valueOf != null) {
                        uVar2.f320428g.k(n18, valueOf.longValue());
                    } else {
                        uVar2.f320428g.j(n18, true);
                    }
                }
            }
        }
    }
}
