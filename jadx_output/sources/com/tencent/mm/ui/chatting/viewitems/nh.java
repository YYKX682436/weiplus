package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class nh extends java.util.HashMap {
    public nh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.storage.f9 f9Var, java.util.Map map) {
        put("msg_svr_id", java.lang.String.valueOf(f9Var.I0()));
        put("template_id", chattingItemDyeingTemplate.H);
        put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, chattingItemDyeingTemplate.N);
        j31.c cVar = chattingItemDyeingTemplate.X;
        put("content", cVar.f297374f);
        put("template_type", java.lang.String.valueOf(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.a1(map)));
        put("container_type", java.lang.String.valueOf(chattingItemDyeingTemplate.W0()));
        put("jump_type", java.lang.String.valueOf(cVar.f297375g));
        put("jump_info", cVar.f297376h);
    }
}
