package io.flutter.plugin.mouse;

/* loaded from: classes15.dex */
public class MouseCursorPlugin {
    private static java.util.HashMap<java.lang.String, java.lang.Integer> systemCursorConstants;
    private final io.flutter.plugin.mouse.MouseCursorPlugin.MouseCursorViewDelegate mView;
    private final io.flutter.embedding.engine.systemchannels.MouseCursorChannel mouseCursorChannel;

    /* loaded from: classes15.dex */
    public interface MouseCursorViewDelegate {
        android.view.PointerIcon getSystemPointerIcon(int i17);

        void setPointerIcon(android.view.PointerIcon pointerIcon);
    }

    public MouseCursorPlugin(io.flutter.plugin.mouse.MouseCursorPlugin.MouseCursorViewDelegate mouseCursorViewDelegate, io.flutter.embedding.engine.systemchannels.MouseCursorChannel mouseCursorChannel) {
        this.mView = mouseCursorViewDelegate;
        this.mouseCursorChannel = mouseCursorChannel;
        mouseCursorChannel.setMethodHandler(new io.flutter.embedding.engine.systemchannels.MouseCursorChannel.MouseCursorMethodHandler() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.MouseCursorChannel.MouseCursorMethodHandler
            public void activateSystemCursor(java.lang.String str) {
                io.flutter.plugin.mouse.MouseCursorPlugin.this.mView.setPointerIcon(io.flutter.plugin.mouse.MouseCursorPlugin.this.resolveSystemCursor(str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.view.PointerIcon resolveSystemCursor(java.lang.String str) {
        if (systemCursorConstants == null) {
            systemCursorConstants = new java.util.HashMap<java.lang.String, java.lang.Integer>() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.2
                private static final long serialVersionUID = 1;

                {
                    put("alias", 1010);
                    put("allScroll", 1013);
                    put("basic", 1000);
                    put("cell", 1006);
                    put("click", 1002);
                    put("contextMenu", 1001);
                    put("copy", 1011);
                    put("forbidden", 1012);
                    put("grab", java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST));
                    put("grabbing", java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_NEED_REENTER));
                    put("help", 1003);
                    put("move", 1013);
                    put(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE, 0);
                    put("noDrop", 1012);
                    put("precise", 1007);
                    put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, 1008);
                    put("resizeColumn", 1014);
                    put("resizeDown", 1015);
                    put("resizeUpLeft", 1016);
                    put("resizeDownRight", 1017);
                    put("resizeLeft", 1014);
                    put("resizeLeftRight", 1014);
                    put("resizeRight", 1014);
                    put("resizeRow", 1015);
                    put("resizeUp", 1015);
                    put("resizeUpDown", 1015);
                    put("resizeUpLeft", 1017);
                    put("resizeUpRight", 1016);
                    put("resizeUpLeftDownRight", 1017);
                    put("resizeUpRightDownLeft", 1016);
                    put("verticalText", 1009);
                    put("wait", 1004);
                    put("zoomIn", 1018);
                    put("zoomOut", java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_OUT));
                }
            };
        }
        return this.mView.getSystemPointerIcon(systemCursorConstants.getOrDefault(str, 1000).intValue());
    }

    public void destroy() {
        this.mouseCursorChannel.setMethodHandler(null);
    }
}
